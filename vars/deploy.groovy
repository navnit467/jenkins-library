#!/usr/bin/env groovy

def call(Map param, Boolean usePipeline = true) {
    def branch = param.get('branch') as String
    def url = param.get('url') as String
if (usePipeline) {
    pipeline {
        agent any
        stages {
            stage('Git Checkout') {
                steps{
                    echo "Hello World"
                   }
                }
           }
        }
    }
}
