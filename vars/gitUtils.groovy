class gitUtils implements Serializable {
	def head() {
		sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
	}
}
