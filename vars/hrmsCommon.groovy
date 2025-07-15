def buildFrontend() {
    dir('Frontend') {
        sh '''
            rm -rf node_modules package-lock.json dist/
            npm install
            ng build --configuration production
        '''
    }
}
