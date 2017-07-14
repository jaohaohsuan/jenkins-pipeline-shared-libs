package com.grandsys.git

class Git {
	static def head = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
}