package com.actian.ilabs.dataflow.stringtemplate.ui.runner;

/*
		Copyright 2015 Actian Corporation

		Licensed under the Apache License, Version 2.0 (the "License");
		you may not use this file except in compliance with the License.
		You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

		Unless required by applicable law or agreed to in writing, software
		distributed under the License is distributed on an "AS IS" BASIS,
		WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		See the License for the specific language governing permissions and
		limitations under the License.
*/

import com.actian.ilabs.dataflow.stringtemplate.runner.RunStringTemplate;
import com.pervasive.datarush.knime.core.framework.AbstractDRNodeFactory;
import com.pervasive.datarush.knime.core.framework.DRNodeModel;
import com.pervasive.datarush.knime.coreui.common.CustomDRNodeDialogPane;

public final class RunStringTemplateNodeModelFactory extends AbstractDRNodeFactory<RunStringTemplate> {

    @Override
    protected CustomDRNodeDialogPane<RunStringTemplate> createNodeDialogPane() {
    	CustomDRNodeDialogPane<RunStringTemplate> dialog = new CustomDRNodeDialogPane<RunStringTemplate>(new RunStringTemplate(), new RunStringTemplateNodeDialogPane());
    	dialog.setDefaultTabTitle("Properties");
        return dialog;
    }

    @Override
    public DRNodeModel<RunStringTemplate> createDRNodeModel() {
        return new DRNodeModel<RunStringTemplate>( new RunStringTemplate(), new RunStringTemplateNodeSettings());
    }

    @Override
    protected boolean hasDialog() {
        return true;
    }
}
