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
        withSonarQubeEnv('SonarServer')
        sh "sonar-scanner"
      }
    }
  }
}
