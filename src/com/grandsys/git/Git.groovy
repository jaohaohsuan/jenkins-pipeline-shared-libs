package com.grandsys.git

class Git {
	static def head(script) {
		script.sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
	}
}
