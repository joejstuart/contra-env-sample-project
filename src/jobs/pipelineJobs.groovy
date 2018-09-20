import org.centos.contra.jobdsl.PipelineJob


def job = new PipelineJob(this, 'samplePipelineJob')
job.addGit('master', 'https://github.com/CentOS-PaaS-SIG/contra-env-sample-project.git')
job.logRotate()
