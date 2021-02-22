pipeline{
  agent 
  {
    docker{
     image 'maven:3-alpine'
        args '-v/.m2:/root/.m2'
  }
}
  

  stages {
    
    
    stage('MavenVersion'){
      steps{
         sh 'echo $JOB_NAME'
        sh 'echo $BUILD_NUMBER'
       
       
      }
     }
   
  
 stage("build & SonarQube analysis") {
            agent any
            steps {
              withSonarQubeEnv('sample') {
                sh 'mvn clean package sonar:sonar'
              }
            }
          }
    
  
  }
}
