enablePlugins(Example)

libraryDependencies += "com.thoughtworks.binding" %%% "jspromisebinding" % "11.7.0+145-d29c9b6f"

libraryDependencies += "com.thoughtworks.binding" %%% "dom" % "11.7.0" % Test

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.10")

jsDependencies in Test += RuntimeDOM

inConfig(Test) {
  jsEnv := RhinoJSEnv().value
}
