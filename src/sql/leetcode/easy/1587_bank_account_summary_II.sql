Select u.name, sum(t.amount) as balance From Users u Left Join Transactions t On u.account = t.account
Group By u.account Having balance > 10000

