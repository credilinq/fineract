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
package org.apache.fineract.infrastructure.jobs.data;

public class PostmarkModel {
    public String total_amount;
    public String currency_code;
    public String client_name;
    public String loan_account_number;
    public String installment_number;
    public String total_installments;
    public String installment_due_date;
    public String installment_principal;
    public String installment_interest;

    public PostmarkModel() {}

    public PostmarkModel(String total_amount, String currency_code, String client_name, String loan_account_number,
                         String installment_number, String total_installments, String installment_due_date,
                         String installment_principal, String installment_interest) {
        this.total_amount = total_amount;
        this.currency_code = currency_code;
        this.client_name = client_name;
        this.loan_account_number = loan_account_number;
        this.installment_number = installment_number;
        this.total_installments = total_installments;
        this.installment_due_date = installment_due_date;
        this.installment_principal = installment_principal;
        this.installment_interest = installment_interest;
    }
}
