#!/usr/bin/env groovy

def call(body) {
    echo "Disable balancer"

    script:this.echo(new Sample(1, 3).toString())

    return this
}
