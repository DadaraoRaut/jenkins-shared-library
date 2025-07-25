def call(String imageName) {
    withCredentials([usernamePassword(credentialsId: 'DOCKERHUB_CREDENTIALS', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
        sh '''
            echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
        '''
        sh "docker push ${imageName}"
    }
}
