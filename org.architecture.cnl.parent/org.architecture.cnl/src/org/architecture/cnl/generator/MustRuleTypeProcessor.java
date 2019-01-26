package org.architecture.cnl.generator;

import org.architecture.cnl.architectureCNL.ConceptExpression;
import org.architecture.cnl.architectureCNL.MustRuleType;
import org.eclipse.emf.ecore.EObject;

public class MustRuleTypeProcessor extends RuleTypeProcessor {
	
	public MustRuleTypeProcessor() {
		
		super.next = new CanOnlyProcessor();
		super.ruletype = "MustRuleTypeImpl";
		
	}

	@Override
	void process(ConceptExpression subject, EObject ruleType) {
		
		
		MustRuleType type = (MustRuleType) ruleType;
		
		
	}

}
