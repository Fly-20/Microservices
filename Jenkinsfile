 node {
      
  stage('Checkout from SVN') { checkout([$class: 'GitSCM', branches: [[name: 'main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Fly-20/Microservices']]]) }
  stage('Build Maven Project'){ sh 'mvn clean install'}

  }
