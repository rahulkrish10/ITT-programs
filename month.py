year1, month1, day1 = 2011, 6, 6  
year2, month2, day2 = 2011, 7, 6   
total_months1 = (year1 * 12) + month1
total_months2 = (year2 * 12) + month2
month_diff = total_months2 - total_months1
if month_diff == 1 and day1 == day2:
    print("Exactly 1 month apart")
elif month_diff < 1 or (month_diff == 1 and day2 < day1):
    print("Less than 1 month apart")
else:
    print("More than 1 month apart")
