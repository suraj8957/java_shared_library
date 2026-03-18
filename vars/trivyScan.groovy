def call() {
    echo "🔥 Trivy Scan START"

    sh '''
    trivy fs -f json -o trivy-report.json .
    '''
}
