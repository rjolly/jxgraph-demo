mkdir("build");
mkdir("build/classes");

javac("src", "build/classes");

mkdir("dist");
jar("dist/jxgraph-demo.jar", "build/classes", ".*", "manifest.mf");

publish("dist")
