import org.centos.contra.jobdsl.PipelineJob


def job = new PipelineJob(this, 'samplePipelineJob')
job.addGit([branch: 'master', repoUrl: 'https://github.com/joejstuart/dockerImages.git'])
job.logRotate()
