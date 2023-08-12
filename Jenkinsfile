pipeline{
  agent any
  stages{
    stage("checkout repo"){
      steps{
        checkout scm
      }
    }
    stage("sonarscan"){
      steps{
        script{
          def scannerHome = tool name: 'SonarQubeScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
          withSonarQubeEnv('SonarServer'){
           sh "${scannerHome}/bin/sonar-scanner"  
          }
        }
        
      }
    }
  }
}
