SOURCEPATH = src/main/java
PACKAGE = br/com/ap220191/ec04_controle_projetos
JFLAGS = -sourcepath $(SOURCEPATH)
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	$(SOURCEPATH)/$(PACKAGE)/model/CorreiosException.java \
	$(SOURCEPATH)/$(PACKAGE)/model/ApiCorreios.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Telefone.java \
	$(SOURCEPATH)/$(PACKAGE)/model/EstadoAlocacao.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Mobilidade.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Colaborador.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Departamento.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Gerente.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Situacao.java \
	$(SOURCEPATH)/$(PACKAGE)/model/AlteracaoSituacao.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Projeto.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Endereco.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Alocacao.java \
	$(SOURCEPATH)/$(PACKAGE)/model/Sexo.java \
	$(SOURCEPATH)/Main.java

default: compile

compile: $(CLASSES:.java=.class)

run: compile
	java -classpath $(SOURCEPATH) Main

clean: $(CLASSES:.java=.class)
	$(RM) $(CLASSES:.java=.class)
