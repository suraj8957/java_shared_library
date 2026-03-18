def call() {
    echo "🔥 Trivy Scan START"
    sh "trivy fs ."
}
