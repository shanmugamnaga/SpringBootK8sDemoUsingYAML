pipeline{
  agent any
  stages{
    stage("checkout repo"){
      steps{
        git credentialsId: 'GIT_CRED', url:  'https://github.com/shanmugamnaga/SpringBootK8sDemoUsingYAML.git',branch: 'master'
      }
    }
  }
}
