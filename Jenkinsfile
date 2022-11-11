pipeline {
  agent any
  tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
  }
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
        sh 'mvn clean package'
      }
    }
    
   stage('Docker Build') {
    	agent any
      steps {
      	sh 'sudo docker build .'
      }
    }
    
    stage ('Deploy') {
      steps {
       echo 'This is yet to deploy.'
      }
    }
  }
}
