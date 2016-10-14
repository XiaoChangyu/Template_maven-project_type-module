nohup java -Xms2048m -Xmx2048m -XX:+UseConcMarkSweepGC \
-Dlogback.configurationFile=./conf/logback.xml -Djava.ext.dirs=./lib \
p.ka.template.maven_module_03.TemplateModule03Main &