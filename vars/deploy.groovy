#!/usr/bin/env groovy

def call(Map param, Boolean usePipeline = true) {
    def branch = param.get('branch') as String
    def url = param.get('url') as String

pipeline {
    stages {
        stage('Git Checkout') {
            steps {
                gitCheckout(
                    branch: "${branch}",
                    url: "${url}"
                )
                }
            }
       }
    }
}