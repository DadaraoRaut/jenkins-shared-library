def call(String kubernetesCredentialsId = 'Kubernetesid', String manifestPath = 'deployment.yml') {
    withCredentials([file(credentialsId: kubernetesCredentialsId, variable: 'KUBECONFIG')]) {
        sh "kubectl apply -f ${manifestPath}"
    }
}
