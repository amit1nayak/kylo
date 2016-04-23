package com.thinkbiganalytics.standardization.transform;

import com.thinkbiganalytics.policies.PolicyTransformException;
import com.thinkbiganalytics.policies.standardization.StandardizationPolicy;
import com.thinkbiganalytics.policy.rest.model.FieldStandardizationRule;

/**
 * Created by sr186054 on 4/21/16.
 */
public interface StandardizationTransformer {

  FieldStandardizationRule toUIModel(StandardizationPolicy standardizationRule);

  StandardizationPolicy fromUiModel(FieldStandardizationRule rule)
      throws PolicyTransformException;


}
