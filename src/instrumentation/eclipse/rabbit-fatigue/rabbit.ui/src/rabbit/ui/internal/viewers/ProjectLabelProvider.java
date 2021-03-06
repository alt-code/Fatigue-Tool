/*
 * Copyright 2010 The Rabbit Eclipse Plug-in Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package rabbit.ui.internal.viewers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

import rabbit.ui.internal.util.ProjectSessionName;

/**
 * Label provider for launches.
 */
public final class ProjectLabelProvider extends NullLabelProvider {

  private final Color gray;

  public ProjectLabelProvider() {
	gray = PlatformUI.getWorkbench().getDisplay()
	          .getSystemColor(SWT.COLOR_DARK_GRAY);
  }

  @Override
  public Color getForeground(Object element) {
    if (element == null) {
      return gray;
    } else if (!(element instanceof ProjectSessionName)) {
      return gray;
    }
    return super.getForeground(element);
  }

  @Override
  public Image getImage(Object element) {
    return super.getImage(element);
  }

  @Override
  public String getText(Object element) {
    if (element instanceof ProjectSessionName) {
      return ((ProjectSessionName) element).getProjectSessionName();
    }
    return super.getText(element);
  }
}
