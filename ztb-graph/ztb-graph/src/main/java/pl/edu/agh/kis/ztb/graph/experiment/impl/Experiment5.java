package pl.edu.agh.kis.ztb.graph.experiment.impl;

public class Experiment5 extends AbstractExperiment {
	//vle(d,8,false,true),
	@Override
	protected void setup() {
		transformer.vertexLabelEdit("d", 8, "false", "true");
	}

}