package com.grandsys.git

static def head() {
	sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
}
