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
package org.ctjava.shipping.account;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Account Page Bean
 * @author Ryan Cuprak
 */
@ApplicationScoped
@Named
public class AccountPage {
    
    private List<Account> accounts;
    
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    public List<Account> getAccounts() {
        return accounts;
    } 
}
