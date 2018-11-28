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
package org.ctjava.shipping.mocks;

import org.ctjava.shipping.account.Account;
import org.ctjava.shipping.dao.AccountDao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 * Mock Account DAO
 * @author Ryan Cuprak
 */
public class MockAccountDaoImpl implements AccountDao {


    private final List<Account> accounts = new ArrayList<>();
    
    @PostConstruct
    private void init() {
        accounts.add(new Account("rcuprak","Ryan","Cuprak","password"));
    }
    
    @Override
    public void saveAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public List<Account> getAccounts() {
        return accounts;
    }
    
}
