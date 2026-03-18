def call(String imageName = "", String path = ".") {
    pipeline {
        agent any

        stages {
            stage('Trivy Dependency Scan') {
                steps {
                    script {
                        sh """
                        echo "Running Trivy Scan..."
                        trivy fs ${path}
                        """
                    }
                }
            }
        }
    }
}