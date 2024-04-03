SELECT cb_vendorinformation.GroupID, cb_vendorinformation.CompanyName, COUNT(*) AS COUNT
FROM maintable_KMMNZ
JOIN cb_vendorinformation ON maintable_KMMNZ.GroupID = cb_vendorinformation.GroupID
GROUP BY cb_vendorinformation.GroupID, cb_vendorinformation.CompanyName
ORDER BY Count, cb_vendorinformation.GroupID;