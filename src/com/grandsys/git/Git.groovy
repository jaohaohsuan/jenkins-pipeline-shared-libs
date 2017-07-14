package com.grandsys.git

class Git {
	def test = {
		return 'test'
	}
	def head = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
}