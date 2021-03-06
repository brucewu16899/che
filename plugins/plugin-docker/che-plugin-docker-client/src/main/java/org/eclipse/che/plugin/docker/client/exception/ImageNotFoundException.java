/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.plugin.docker.client.exception;

/**
 * Occurs when docker image is not found.
 *
 * @author Anton Korneta
 */
public class ImageNotFoundException extends DockerException {

    public ImageNotFoundException(String message) {
        super(message, 404);
    }
}
