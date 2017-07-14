package com.grandsys.git

class Git {
	static def head() {
		return sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
	}
}
