package com.grandsys.git

def test = 'test'
def head = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()

return this
