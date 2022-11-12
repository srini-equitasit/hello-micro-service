pipeline {
  agent any
  tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
  }
  def app
  stages {
  
   stage ('Initialize') {
        steps {
            sh '''
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
            ''' 
        }
    }
  
    stage ('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
    
   stage('Docker Build') {
      steps {
      	//sh 'docker build . -t hello-micro-service'
      	script{
      	 app = docker.build("hello-micro-service:${env.BUILD_ID}")
      	}
      }
    }
    
    stage ('Deploy') {
      steps {
      script{
        app.push()
       }
       echo 'image pushed'
      }
    }
  }
}
