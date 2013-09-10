/*
 * Copyright (C) 2013 Brett Wooldridge
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.nuprocess.linux;

import java.util.List;

import org.nuprocess.NuProcess;
import org.nuprocess.NuProcessFactory;
import org.nuprocess.NuProcessHandler;

/**
 * Linux process factory.  Creates and starts a process.
 *
 * @author Brett Wooldridge
 */
public class LinProcessFactory implements NuProcessFactory
{
    /** {@inheritDoc} */
    @Override
    public NuProcess createProcess(List<String> commands, String[] env, NuProcessHandler processListener)
    {
        LinuxProcess process = new LinuxProcess(commands, env, processListener);
        process.start();
        return process;
    }
}
