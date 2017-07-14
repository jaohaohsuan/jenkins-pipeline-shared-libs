package com.grandsys.git

def head = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()