package org.architecture.cnl.generator;

import org.architecture.cnl.architectureCNL.ConceptExpression;
import org.eclipse.emf.ecore.EObject;

public abstract class RuleTypeProcessor {
	
	protected RuleTypeProcessor next;
	protected String ruletype;
	
	public RuleTypeProcessor get(String ruleType) {
		if(ruletype.equals(ruleType)){
			return this;
		}
		return next;
	}
	
	abstract void process(ConceptExpression subject, EObject ruleType);

}
