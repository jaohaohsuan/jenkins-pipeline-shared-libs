package com.grandsys.git

class Git {
	def head = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
}