from django.http import HttpResponse
from django.shortcuts import render

my_dict = {'insert_me': "Hello I am from views.py!"}

def index(request):
    return render(request,'first_app/index.html')
def home(request):
    return render(request,'first_app/home.html')

def search(request):
    return render(request,'first_app/search.html')

def about(request):
    return render(request,'first_app/about.html')

def educative(request):
    return render(request, 'first_app/educative.html')