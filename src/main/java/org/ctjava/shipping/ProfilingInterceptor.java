/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ctjava.shipping;

import java.util.Date;
import javax.inject.Inject;
import javax.interceptor.InvocationContext;

/**
 * Profiles a method
 * @author Ryan Cuprak
 */
public class ProfilingInterceptor {
    
    @Inject
    private ProfilingMonitoring monitor;
    
    public Object profileMethod(InvocationContext invocationContext)
            throws Exception {
        long start = new Date().getTime();
        Object obj = invocationContext.proceed();
        long elapsed = new Date().getTime() - start;
        monitor.recordTime(invocationContext.getMethod().getName(), elapsed);
        return obj;
    }
}
