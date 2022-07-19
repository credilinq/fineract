/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.portfolio.loanaccount.loanschedule.data;

import java.math.BigDecimal;

public class SoonToBeDueLoanScheduleData {

    private final Long loanId;
    private final Long clientId;
    private final String locale;
    private final String dateFormat;
    private final String dueDate;
    private final BigDecimal principalOutstanding;
    private final BigDecimal interestOutstanding;
    private final Integer periodNumber;

    public SoonToBeDueLoanScheduleData(final Long loanId, final Long clientId, final String dueDate,
                                   final String dateFormat, final String locale, final BigDecimal principalOutstanding, final BigDecimal interestOutstanding,
                                   final Integer periodNumber) {
        this.loanId = loanId;
        this.clientId = clientId;
        this.dueDate = dueDate;
        this.dateFormat = dateFormat;
        this.locale = locale;
        this.principalOutstanding = principalOutstanding;
        this.interestOutstanding = interestOutstanding;
        this.periodNumber = periodNumber;
    }

    public Long getLoanId() {
        return this.loanId;
    }

    public Long getClientId() {
        return this.clientId;
    }

    public String getDueDate() {
        return this.dueDate;
    }


    public String getDateFormat() {
        return this.dateFormat;
    }

    public String getLocale() {
        return this.locale;
    }

    public BigDecimal getPrincipalOutstanding() {
        return this.principalOutstanding;
    }

    public BigDecimal getInterestOutstanding() {
        return interestOutstanding;
    }

    public Integer getPeriodNumber() {
        return this.periodNumber;
    }

    @Override
    public String toString() {
        return "{" + "chargeId:" + this.clientId + ", locale:'" + this.locale + '\'' + ", amount:" + ", dateFormat:'"
                + this.dateFormat + '\'' + ", dueDate:'" + this.dueDate + '\'' + ", principal:'" + this.principalOutstanding + '\''
                + ", interest:'" + this.interestOutstanding + '\'' + '}';
    }

}
