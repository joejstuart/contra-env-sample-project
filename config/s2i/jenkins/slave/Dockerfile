FROM openshift/jenkins-slave-base-centos7
RUN yum install -y epel-release
# add ruby for ghi
RUN yum install -y ansible \
        jq \
        ruby
RUN curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py && \
    python get-pip.py && \
    sudo -H pip install openshift

