#!/usr/bin/env groovy

def call(body) {
    echo "Check status"
    currentBuild.result = 'SUCCESS' //FAILURE to fail
    return this
}
