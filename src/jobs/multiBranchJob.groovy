multibranchPipelineJob('testPipeline') {
    branchSources {
        github {
            repoOwner('CentOS-PaaS-SIG')
            repository('cloud-image-builder')
        }
    }
}

