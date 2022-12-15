FROM mcr.microsoft.com/devcontainers/java:0-17-bullseye

ARG KOTLIN_VERSION="1.7.21"

RUN echo "--- ${KOTLIN_VERSION} ---"

RUN curl -s https://get.sdkman.io | bash
RUN bash -c " \
    source /usr/local/sdkman/bin/sdkman-init.sh && \
    sdk install kotlin ${KOTLIN_VERSION} \
    "
