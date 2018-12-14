import org.centos.contra.jobdsl.PipelineJob

def components = System.getenv('COMPONENT_JOBS')

println components
def job = new PipelineJob(this, 'samplePipelineJob')

// uncomment if you have fed msg configured
//job.fedMsgTrigger('org.fedoraprojectb', 'fedora-fedmsg', ['check1': 'value1'])
job.addGit([repo_branch: 'master', repo_url: 'https://github.com/CentOS-PaaS-SIG/contra-env-sample-project.git'])
job.logRotate()
