def call(String imageName, String buildPath) {
    sh "docker build -t ${imageName} ${buildPath}"
}

