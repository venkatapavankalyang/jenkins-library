def call() {
    def PIPELINE_PROPS = readProperties file: 'pipelineproperties/pipeline.properties'
    gitCheckOut("${PIPELINE_PROPS["MAVEN_URL"]}", "$params.Branch")
    compileSource("${PIPELINE_PROPS["MAVEN_BUILD_COMMAND"]}")
}